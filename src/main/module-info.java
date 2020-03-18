/**
 * Create by Dawid Lachor on 26.02.2020
 */
module MP3Player {
     requires javafx.graphics;
     requires javafx.controls;
     requires javafx.fxml;
     requires javafx.media;
     requires jid3lib;

     exports pl.dawidlachor.mp3player.main to javafx.graphics;
     opens pl.dawidlachor.mp3player.controler to javafx.fxml;
     opens pl.dawidlachor.mp3player.mp3 to javafx.base;
}