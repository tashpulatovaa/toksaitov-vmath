package vmath;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Mat3Test {

    @Test
    void givenNoArgs_whenMat3Created_thenMatrixIsIdentity() {
        Mat3 mat = new Mat3();
        assertEquals(mat.m[0], 1.0f);
        assertEquals(mat.m[1], 0.0f);
        assertEquals(mat.m[2], 0.0f);
        assertEquals(mat.m[3], 0.0f);
        assertEquals(mat.m[4], 1.0f);
        assertEquals(mat.m[5], 0.0f);
        assertEquals(mat.m[6], 0.0f);
        assertEquals(mat.m[7], 0.0f);
        assertEquals(mat.m[8], 1.0f);
    }
}
