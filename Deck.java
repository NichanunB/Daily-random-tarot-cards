import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<TarotCard> cards;

    // Constructor
    public Deck() {
        cards = new ArrayList<>();
    }

    // เพิ่มไพ่ในสำรับ
    public void addCard(TarotCard card) {
        cards.add(card);
    }

    // สับไพ่
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // ให้ผู้ใช้เลือกไพ่ 1 ใบ
    public TarotCard selectCard() {
        if (cards.isEmpty()) {
            System.out.println("No cards in the deck.");
            return null;
        }

        TarotCard selectedCard = cards.get(0); // ใช้การเลือกใบแรกในสำรับ
        selectedCard.getImageBack(); // แสดงภาพหลังไพ่
        System.out.println("You selected a card!");
        selectedCard.reveal(); // เปิดไพ่และแสดงข้อมูล
        return selectedCard;
    }
}
