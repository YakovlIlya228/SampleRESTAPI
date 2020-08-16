package com.example.samplerestapitest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleListAdapter(context: Context): RecyclerView.Adapter<SampleListAdapter.SampleViewHolder>() {

    private var itemList = emptyList<Post>()
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    class SampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var userId: TextView?
        var id: TextView?
        var title: TextView?
        var body: TextView?
        init {
           userId = itemView.findViewById(R.id.userId)
           id = itemView.findViewById(R.id.ID)
           title = itemView.findViewById(R.id.title)
           body = itemView.findViewById(R.id.body)
       }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val itemView = inflater.inflate(R.layout.sample_item_layout,parent,false)
        return SampleViewHolder(itemView)
    }
    fun setPosts(itemList: ArrayList<Post>){
        this.itemList = itemList
        this.notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.userId?.text = itemList[position].userId
        holder.id?.text = itemList[position].id
        holder.title?.text = itemList[position].title
        holder.body?.text = itemList[position].body


    }

}