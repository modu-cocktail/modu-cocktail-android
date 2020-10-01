package com.cmd.moducocktail

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CocktailAdapter(val cocktailList: ArrayList<Cocktails>) : RecyclerView.Adapter<CocktailAdapter.CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_cocktail, parent, false)
        // TODO : 클릭 시 넘어가는 인텐트 추가


        return CustomViewHolder(view).apply{
            itemView.setOnClickListener{
                val curPos: Int = adapterPosition
                val cocktail: Cocktails = cocktailList[curPos]

                // 인텐트 번들에 넣어 실행하기
                val intent = Intent(itemView?.context, DetailActivity::class.java)
                // TODO : intent.putExtra("cocktail", cocktail) 왜 오류뜨지?
                ContextCompat.startActivity(itemView.context, intent, null)

            }
        }
    }

    override fun getItemCount(): Int {
        return cocktailList.size
    }

    override fun onBindViewHolder(holder: CocktailAdapter.CustomViewHolder, position: Int) {
        holder.image.setImageResource(cocktailList[position].image)
        holder.name.text = cocktailList[position].name

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.cocktail_image)
        val name = itemView.findViewById<TextView>(R.id.cocktail_name)
    }
}

