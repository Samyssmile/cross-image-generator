package de.abramov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageIllustratorTest {

    @Test
    void drawImage() {
        ImageIllustrator imageIllustrator = new ImageIllustrator();
        assertNotNull(imageIllustrator.drawImage(64, 64));
    }
}