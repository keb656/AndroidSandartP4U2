package com.example.androidsandartp4u

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import java.util.ArrayList

class myRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val cardViewItemDTOS = ArrayList<CardViewItemDTO>()

    init {
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_01/*, "한국어", "한국어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_02/*, "English", "영어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_03/*, "简体中文", "중국어 간체"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_04/*, "繁體中文", "중국어 번체"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_05/*, "日本語", "일본어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_06/*, "русский", "러시아어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_07/*, "français", "프랑스어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_08/*, "Español", "스페인어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_09/*, "हिंदी", "힌디어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_10/*, "मंगोलियन", "몽골어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_11/*, "Polskie", "폴란드어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_12/*, "Türk", "터키어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_13/*, "नेपाली", "네팔어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_14/*, "bahasa Indonesia", "인도네시아어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_15/*, "ไทย", "태국어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_16/*, "កម្ពុជា", "캄보디아어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_17/*, "Filipino", "필리핀어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_18/*, "Tiếng Việt", "베트남어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_19/*, "", "아라비아어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_20/*, "ລາວ", "라오스어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_21/*, "ایران", "페르시아어"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_22/*, "پاکستان - مرد", "파키스탄어_남"*/))
        cardViewItemDTOS.add(CardViewItemDTO(R.drawable.flag_23/*, "파키스탄어_여", "پاکستانی - عورت"*/))

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        // xml 세팅
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item, parent, false)

        return RowCell(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        // 아이템 세팅
        (holder as RowCell).imageView.setImageResource(cardViewItemDTOS[position].imageview)
        //((RowCell)holder).title.setText(cardViewItemDTOS.get(position).title);
        //((RowCell)holder).subtitle.setText(cardViewItemDTOS.get(position).subtitle);

    }

    override fun getItemCount(): Int {

        // 이미지 카운터
        return cardViewItemDTOS.size
    }

    private inner class RowCell
    //public TextView title;
    //public TextView subtitle;

    (view: View) : RecyclerView.ViewHolder(view) {

        var imageView: ImageView

        init {
            imageView = view.findViewById<View>(R.id.cardview_imageview) as ImageView
            //title = (TextView) view.findViewById(R.id.cardview_title);
            //subtitle = (TextView) view.findViewById(R.id.cardview_subtitle);
        }
    }
}
