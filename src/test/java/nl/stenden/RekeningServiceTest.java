package nl.stenden;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class RekeningServiceTest {

    RekeningService rekeningService;

    RekeningRepository mockRepository;

    @BeforeEach
    public void setup() {
        mockRepository = mock(RekeningRepository.class);
        rekeningService = new RekeningService(mockRepository);
    }

    @Test
    public void testFindRekening() {
        // Setup / Arrange
        when(mockRepository.getRekeningen())
                .thenReturn(List.of(
                        new Rekening("XYZ1", 99, "Hink"),
                        new Rekening("XYZ2", 88, "Hynk")
                ));
        // When / Act
        Rekening abc1 = rekeningService.findRekening("XYZ1");
        // Verify / Assert
        assertNotNull(abc1);
        assertEquals(abc1.getEigenaar(), "Hink");

    }


}
