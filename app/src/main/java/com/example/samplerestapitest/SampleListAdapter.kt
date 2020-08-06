package com.example.samplerestapitest

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleListAdapter(): RecyclerView.Adapter<SampleListAdapter.SampleViewHolder>() {

    var itemList = emptyList<Post>()

    class SampleViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.sample_item_layout, viewGroup,false)){
        var userId: TextView? = null
        var id: TextView? = null
        var title: TextView? = null
        var body: TextView? = null
        init {
            userId = viewGroup.findViewById(R.id.userId)
            id = viewGroup.findViewById(R.id.ID)
            title = viewGroup.findViewById(R.id.title)
            body = viewGroup.findViewById(R.id.body)

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SampleViewHolder(inflater,parent)
    }
    public fun setPosts(itemList: ArrayList<Post>){
        this.itemList = itemList
        notifyDataSetChanged()
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