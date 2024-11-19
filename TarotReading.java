public class TarotReading {
    private User user;                // ผู้ใช้ที่ทำการอ่านไพ่
    private TarotCard drawnCard;      // ไพ่ที่จั่ว

    // คอนสตรัคเตอร์ (Constructor) สำหรับกำหนดค่าต่างๆ
    public TarotReading(User user, TarotCard drawnCard) {
        this.user = user;
        this.drawnCard = drawnCard;
    }

    // Getter สำหรับดึงค่าต่างๆ
    public User getUser() {
        return user;
    }

    public TarotCard getDrawnCard() {
        return drawnCard;
    }

}
