package lima.luiz.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var drawerLayout: DrawerLayout
    lateinit var appBarConfiguration: AppBarConfiguration

    var navigationView: NavigationView = findViewById<NavigationView>(R.id.navigationView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment)
        drawerLayout = findViewById(R.id.drawer_layout)

        navigationView.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
        setupActionBarWithNavController(navController,appBarConfiguration)


        //override fun onSupportNavigateUp(): Boolean {
        //    val navController = findNavController(R.id.fragment)
        //    return navController.navigateUp(appBarConfiguration)
        //}

        //https://developer.android.com/guide/navigation/navigation-migrate
        //igual o exempo no site mas não funciona :/
        //teoricamente com esse metodo o menu de navegação funcionaria
        //os botões não conseguir fazer as activitys registrarem os clicks





    }
}