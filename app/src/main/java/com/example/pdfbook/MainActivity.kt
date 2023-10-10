package com.example.pdfbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.BookAdapter
import com.BookModel
import com.example.pdfbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<BookModel> = ArrayList()
    var adapter = BookAdapter(list, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            homeRecyclerView.adapter = adapter
            list.add(
                BookModel(
                    R.drawable.book_1, "Rich Dad Poor Dad ",getString(R.string.description_1) , "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_2, "sample_book_synopsis", getString(R.string.description_2), "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_3, "Best Self", getString(R.string.description_3), "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_4, "How to be Fine", getString(R.string.description_4), "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_5, "Out oF the Box", getString(R.string.description_5), "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_6, "Stripped", getString(R.string.description_6), "sample_book_pdf"
                )
            )
            list.add(
                BookModel(
                    R.drawable.book_7, "12 Rules For Life", getString(R.string.description_7), "sample_book_pdf"
                )
            )
        }
    }
}