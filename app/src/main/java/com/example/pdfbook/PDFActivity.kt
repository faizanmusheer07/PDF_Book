package com.example.pdfbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.pdfbook.databinding.ActivityPdfactivityBinding

class PDFActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfactivityBinding.inflate(layoutInflater)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.apply {
            val bookPDF = intent.getStringExtra("book_PDF").toString()
            pdfView.fromAsset("sample_book.pdf")
                .swipeHorizontal(true)
                .enableSwipe(true)
                .swipeHorizontal(true)

                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .load()

        }
    }
}