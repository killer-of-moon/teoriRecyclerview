package com.farell.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_hero.view.*


class ListHeroAdapter(private val listhero: ArrayList<HeroModel>) :
    RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(heroModel: HeroModel) {
            with(itemView) {
                Glide.with(itemView)
                    .load(heroModel.photo)
                    .apply(RequestOptions().override(55, 55))
                    .into(img_item_photo)

                tv_item_name.text = heroModel.name
                tv_item_description.text = heroModel.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listhero.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listhero[position])
    }

}