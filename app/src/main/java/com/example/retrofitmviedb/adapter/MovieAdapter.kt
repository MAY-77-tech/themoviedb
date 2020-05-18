package com.example.retrofitmviedb.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view.view.*

class MovieAdapter (var movieList: List<Result> = ArrayList()):
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    inner class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindMovie(result: Result){
            itemView.txt_movName.text = result.title
            Picasso.get().load("https://image.tmdb.org/t/p/w200${result.poster_path}").into(itemView.mov_img)
        }
    }
}