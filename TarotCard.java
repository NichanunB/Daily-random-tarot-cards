public class TarotCard {
    private String name;        // ชื่อไพ่
    private String meaning;     // ความหมายของไพ่
    private String imageBack;   // ลิงก์รูปภาพด้านหลังไพ่
    private String imageFront;  // ลิงก์รูปภาพด้านหน้าไพ่

    // คอนสตรัคเตอร์
    public TarotCard(String name, String meaning, String imageBack, String imageFront) {
        this.name = name;
        this.meaning = meaning;
        this.imageBack = imageBack;
        this.imageFront = imageFront;
    }

    // Getter สำหรับดึงค่าข้อมูลแต่ละตัวแปร
    public String getName() {
        return name;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getImageBack() {
        return imageBack;
    }

    public String getImageFront() {
        return imageFront;
    }

    // เปิดไพ่และแสดงรายละเอียด
    public void reveal() {
        // แสดงผลตามที่ต้องการ
        System.out.println(name);
        System.out.println("Image: " + imageFront);
        System.out.println("คำทำนายเหตุการณ์ประจำวัน: " + meaning);
    }
}
