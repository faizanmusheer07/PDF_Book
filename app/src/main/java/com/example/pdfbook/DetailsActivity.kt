package com.example.pdfbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdfbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    val activity = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val booktitle = intent.getStringExtra("book_Title").toString()
        val bookdesc = intent.getStringExtra("book_Desc").toString()
        val bookpdf = intent.getStringExtra("book_PDF").toString()
        val bookimage = intent.getIntExtra("book_Image", 0)


        binding.apply {
            BookTitle.text = booktitle
            BookDescription.text = bookdesc
            BookImage.setImageResource(bookimage)

            ReadBook.setOnClickListener {
                val intent = Intent()
                intent.putExtra("book_PDF", bookpdf)
                intent.setClass(activity, PDFActivity::class.java)
                startActivity(intent)

            }
        }
    }
}