package com.example.lab4_mkv.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IIteratorTest {

    @Test
    void onehasNext() {
        ImageCollection imageCollection = new ImageCollection("src/main/resources/image");
        IIterator iterator = imageCollection.getIterator();
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s1.jpg", iterator.next());
        assertFalse(iterator.hasNext(1));
    }

    @Test
    void morehasNext(){
        ImageCollection collection = new ImageCollection("src/main/resources/image");
        IIterator iterator = collection.getIterator();
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s1.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s2.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s3.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s4.jpg", iterator.next());
        assertFalse(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s5.jpg", iterator.next());
        assertFalse(iterator.hasNext(1));
    }

    @Test
    public void onenext() {
        ImageCollection collection = new ImageCollection("test_images/image");
        IIterator iterator = collection.getIterator();
        assertTrue(iterator.hasNext(1));
        assertEquals("file:test_images/image1.png", iterator.next());
        assertFalse(iterator.hasNext(1));
        assertNull(iterator.next());
    }


    @Test
    public void morenext(){
        ImageCollection collection = new ImageCollection("src/main/resources/image");
        IIterator iterator = collection.getIterator();
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s1.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s2.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s3.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s4.jpg", iterator.next());
        assertFalse(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s5.jpg", iterator.next());
        assertFalse(iterator.hasNext(1));
        assertNull(iterator.next());
    }

    @Test
    void preview() {
        ImageCollection collection = new ImageCollection("src/main/resources/image");
        IIterator iterator = collection.getIterator();
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s1.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s2.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s3.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s4.jpg", iterator.next());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s5.jpg", iterator.preview());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s4.jpg", iterator.preview());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s3.jpg", iterator.preview());
        assertTrue(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s2.jpg", iterator.preview());
        assertFalse(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s1.jpg", iterator.preview());
        assertFalse(iterator.hasNext(1));
        assertEquals("src/main/resources/image/s5.jpg", iterator.preview());
        assertFalse(iterator.hasNext(1));
    }
}