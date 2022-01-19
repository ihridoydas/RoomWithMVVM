import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hridoydas.roomwithmvvm.databinding.FragmentHomeBinding
import com.hridoydas.roomwithmvvm.ui.BaseFragment

class HomeFragment :BaseFragment() {



    private var _binding :FragmentHomeBinding?= null
    private val binding  get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.itemEntitiesLivadata.observe(viewLifecycleOwner){itemEntityList->

            //TODO




        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}