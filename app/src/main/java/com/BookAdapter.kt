package com

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.pdfbook.DetailsActivity
import com.example.pdfbook.databinding.LayoutHomeBinding

class BookAdapter(var list: ArrayList<BookModel>, var context: Context) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    class BookViewHolder(var binding: LayoutHomeBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            LayoutHomeBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val dataStore = list[position]
        holder.binding.apply {
            BookImage.setImageResource(dataStore.image)
            cardView.setOnClickListener {
                val intent = Intent()
                intent.putExtra("book_Title", dataStore.title)
                intent.putExtra("book_Desc", dataStore.description)
                intent.putExtra("book_PDF", dataStore.bookPDF)
                intent.putExtra("book_Image", dataStore.image)
                intent.setClass(context, DetailsActivity::class.java)
                var options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    context as Activity,
                    BookImage,
                    "BookTrans"
                )
                context.startActivity(intent, options.toBundle())
            }
        }
    }
}