package com.cmd.moducocktail

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.highlight.RadarHighlighter
import com.github.mikephil.charting.renderer.RadarChartRenderer
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val entries = ArrayList<RadarEntry>()
        entries.add(RadarEntry(1.0f, "단맛"))
        entries.add(RadarEntry(1.5f, "쓴맛"))
        entries.add(RadarEntry(2.0f, "신맛"))
        entries.add(RadarEntry(3.0f, "술맛"))
        entries.add(RadarEntry(3.5f, "탄산"))
        val radarDataSet = RadarDataSet(entries, "메롱")


        val data = RadarData(radarDataSet)
        chart.data = data
        chart.setBackgroundColor(Color.rgb(60, 65, 82))
        chart.description.isEnabled = false
        chart.webLineWidth = 1.0f
        chart.webColor = Color.WHITE
        chart.webLineWidth = 1.0f
        chart.webColorInner = Color.WHITE
        chart.webAlpha = 100




        // 액션바 커스터마이징
        val actionbar = supportActionBar
        actionbar!!.title = "${intent.getStringExtra(("cocktailName"))}"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}