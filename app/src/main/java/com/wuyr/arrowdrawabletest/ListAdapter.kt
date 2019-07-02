package com.wuyr.arrowdrawabletest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adatper_list_item_view.view.*

/**
 * @author wuyr
 * @github https://github.com/wuyr/ArrowDrawable
 * @since 2019-06-30 下午8:24
 */
class ListAdapter(
        context: Context,
        private var data: MutableList<String>
) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    fun setData(vararg dataList: String) {
        data.clear()
        data.addAll(dataList.toList())
        notifyItemRangeChanged(0, data.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(layoutInflater.inflate(R.layout.adatper_list_item_view, parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.textView
    }

}