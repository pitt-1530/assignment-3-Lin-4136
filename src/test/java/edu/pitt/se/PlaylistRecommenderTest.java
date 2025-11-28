package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class PlaylistRecommenderTest {

    private PlaylistRecommender recommender = new PlaylistRecommender();

    @Test
    void testClassifyEnergyHigh() {
        // You can use 'recommender' immediately
        List<Integer> fastSongs = Arrays.asList(140, 160, 150);
        assertEquals("HIGH", recommender.classifyEnergy(fastSongs));
    }

    @Test
    void testInvalidTrackTitleSymbols() {
        // Numbers/Symbols are not allowed
        assertFalse(recommender.isValidTrackTitle("Special Characters1111&&!"));
    }

    @Test
    void testNormalizeVolumeClampHigh() {
        // 120 should become 100
        assertEquals(100, recommender.normalizeVolume(120));
    }
}
