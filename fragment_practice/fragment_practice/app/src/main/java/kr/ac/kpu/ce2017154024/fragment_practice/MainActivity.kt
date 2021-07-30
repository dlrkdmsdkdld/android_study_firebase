package kr.ac.kpu.ce2017154024.fragment_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.cat ->{
                var catFragment = cat_fragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,catFragment).commit()
                return true
            }
            R.id.dog ->{
                var dogFragment = dog_fragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,dogFragment).commit()
                return true
            }
            R.id.horse ->{
                var horseFragment = horse_fragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,horseFragment).commit()
                return true
            }
            R.id.rabbit ->{
                var rabbitFragment = rabbit_fragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,rabbitFragment).commit()
                return true
            }


        }
        return false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationview.setOnNavigationItemSelectedListener(this)


    }
}