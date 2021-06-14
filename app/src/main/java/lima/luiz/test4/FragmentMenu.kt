package lima.luiz.test4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_menu.view.*


class FragmentMenu : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.btn_1.setOnClickListener{
            Log.d("debug","botão 1")
            Navigation.findNavController(view).navigate(R.id.gotoWhoAmI)
        }

        view.btn_2.setOnClickListener{
            Log.d("debug","botão 2")
            Navigation.findNavController(view).navigate(R.id.gotoBadges)
        }

        view.btn_3.setOnClickListener{
            Log.d("debug","botão 3")
            Navigation.findNavController(view).navigate(R.id.gotoTeam)
        }

        return view
    }



}