document.getElementById("drawButton").addEventListener("click", async function() {
    try {
        const response = await fetch("/api/tarot/draw");
        const card = await response.json();
        document.getElementById("cardResult").innerHTML = 
            `Card: ${card.name} <br> Meaning: ${card.meaning}`;
    } catch (error) {
        console.error("Error drawing card:", error);
    }
});
