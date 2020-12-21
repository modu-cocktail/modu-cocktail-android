package com.cmd.moducocktail

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.highlight.RadarHighlighter
import com.github.mikephil.charting.renderer.LegendRenderer
import com.github.mikephil.charting.renderer.RadarChartRenderer
import com.github.mikephil.charting.utils.ViewPortHandler
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val MAX = 5f
        val MIN = 1f

        // TODO : 일단 번호떼는거 빼고 구현은 했는데.. 갑자기 piechart가 더 예뻐보인다.
        val entries = ArrayList<RadarEntry>()
        val hi = ArrayList<String>()
        hi.add("단맛")
        hi.add("쓴맛")
        hi.add("신맛")
        hi.add("술맛")
        hi.add("틴신")
        entries.add(RadarEntry(intent.getFloatExtra("cocktailSweet", 0f), "단맛"))
        entries.add(RadarEntry(intent.getFloatExtra("cocktailBitter", 0f), "쓴맛"))
        entries.add(RadarEntry(intent.getFloatExtra("cocktailSour", 0f), "신맛"))
        entries.add(RadarEntry(intent.getFloatExtra("cocktailAlcohol", 0f), "술맛"))
        entries.add(RadarEntry(intent.getFloatExtra("cocktailSprite", 0f), "탄산"))
        val radarDataSet = RadarDataSet(entries, "메롱")
        radarDataSet.color = Color.BLUE // 그래프 자체의 색깔을 결정



        val data = RadarData(radarDataSet)
        chart.data = data
        chart.setBackgroundColor(Color.rgb(255, 255, 250))
        chart.description.isEnabled = false
        chart.webLineWidth = 1.0f
        chart.webColor = Color.DKGRAY
        chart.webLineWidth = 1.0f
        chart.webColorInner = Color.LTGRAY
        chart.webAlpha = 100
        chart.legend.isEnabled = false
        chart.setTouchEnabled(false)



//        chart.invalidate()

        chart.xAxis.textSize=9f
        chart.xAxis.yOffset=0f
        chart.xAxis.xOffset=0f
        chart.xAxis.valueFormatter=IndexAxisValueFormatter(hi)





        // 액션바 커스터마이징
        val actionbar = supportActionBar
        actionbar!!.title = "${intent.getStringExtra(("cocktailName"))}"
        actionbar.setDisplayHomeAsUpEnabled(true)

        // 인텐트값 적용
        iv_image.setImageResource(intent.getIntExtra("cocktailImage", R.drawable.logo))
        tv_description.text = intent.getStringExtra("cocktailDescription")
        tv_recipes.text = intent.getStringExtra("cocktailRecipes")


    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}