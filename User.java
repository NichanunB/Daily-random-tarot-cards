import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private String name;                  // ชื่อผู้ใช้
    private List<TarotCard> drawnCards;   // รายการไพ่ที่ผู้ใช้จั่ว
    private List<TarotReading> readings;  // รายการการอ่านไพ่ทั้งหมด

    // คอนสตรัคเตอร์
    public User(String name) {
        this.name = name;
        this.drawnCards = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    // ฟังก์ชันสำหรับจั่วไพ่ประจำวัน
    public TarotCard drawDailyCard(List<TarotCard> deck) {
        if (deck.isEmpty()) {
            System.out.println("No cards left in the deck.");
            return null;
        }

        // สุ่มเลือกไพ่จากสำรับ
        Random rand = new Random();
        int index = rand.nextInt(deck.size());
        TarotCard card = deck.get(index);
        deck.remove(index);  // เอาไพ่ที่เลือกออกจากสำรับ

        drawnCards.add(card); // เพิ่มไพ่ที่จั่วลงในประวัติของผู้ใช้

        // สร้างการอ่านไพ่ใหม่และเก็บประวัติ
        TarotReading reading = new TarotReading(this, card);
        readings.add(reading);

        // คืนค่าไพ่ที่จั่วออกไป
        return card;
    }

    // ฟังก์ชันแสดงประวัติการจั่วไพ่
    public void showDrawnCards() {
        System.out.println(name + "'s drawn cards:");
        for (TarotCard card : drawnCards) {
            System.out.println("Card: " + card.getName() + " | Meaning: " + card.getMeaning());
            card.reveal();  // แสดงรายละเอียดของไพ่แต่ละใบ
        }
    }

    // ฟังก์ชันแสดงประวัติการอ่านไพ่ทั้งหมด
    public void showReadings() {
        System.out.println(name + "'s tarot readings");
        for (TarotReading reading : readings) {
            reading.displayReading();  // แสดงผลการอ่านไพ่
        }
    }
}
