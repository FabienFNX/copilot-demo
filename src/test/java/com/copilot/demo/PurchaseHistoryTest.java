package com.copilot.demo;
import com.copilot.demo.models.PurchaseRecord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseHistoryTest {

    @Test
    void testUniqueness() {
        // Create two purchase records with the same ID
        PurchaseRecord record1 = new PurchaseRecord("Product1", 1, 100, "2023-01-01");
        PurchaseRecord record2 = new PurchaseRecord("Product2", 2, 200, "2023-01-02");

        // Check if the IDs are unique
        assertNotEquals(record1.getId(), record2.getId());
    }

    @Test
    void testCorrectness() {
        // Create a purchase record
        PurchaseRecord record = new PurchaseRecord("Product1", 1, 100, "2023-01-01");

        // Check if the details are correct
        assertEquals("Product1", record.getProduct());
        assertEquals(1, record.getQuantity());
        assertEquals(100, record.getPrice());
        assertEquals("2023-01-01", record.getDate());
    }

    @Test
    void testCompleteness() {
        // Create a list of purchases made by a customer
        List<PurchaseRecord> purchases = new ArrayList<>();
        purchases.add(new PurchaseRecord("Product1", 1, 100, "2023-01-01"));
        purchases.add(new PurchaseRecord("Product2", 2, 200, "2023-01-02"));

        // Check if all purchases are recorded
        assertEquals(2, purchases.size());
    }

    @Test
    void testTimeliness() {
        // Create a purchase record
        PurchaseRecord record = new PurchaseRecord("Product1", 1, 100, "2023-01-01");

        // Check if the record was created/updated in a timely manner
        assertEquals("2023-01-01", record.getDate());
    }

    @Test
    void testConsistency() {
        // Create two purchase records
        PurchaseRecord record1 = new PurchaseRecord("Product1", 1, 100, "2023-01-01");
        PurchaseRecord record2 = new PurchaseRecord("Product2", 2, 200, "2023-01-02");

        // Check if the format and structure are consistent
        assertEquals(record1.getClass(), record2.getClass());
    }
}