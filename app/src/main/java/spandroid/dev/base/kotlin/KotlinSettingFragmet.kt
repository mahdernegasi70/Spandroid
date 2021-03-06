package spandroid.dev.base.kotlin

import android.os.Bundle
import android.support.annotation.Nullable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import spandroid.dev.R
import spandroid.dev.kotlin.base.BaseKotlinFragment


class KotlinSettingFragmet : BaseKotlinFragment() {

    var toolbarTitle: String = ""

    companion object {

        val TAG: String = "KotlinSettingFragmet"

        fun newInstance(param1: String): KotlinSettingFragmet {
            val fragment = KotlinSettingFragmet()
            val args = Bundle()
            args.putString("title", param1)
            fragment.arguments = args
            return fragment
        }
    }

    override fun initializeResources() {
    }

    override fun setListeners() {
    }

    override fun getToolBarTitle(): String {
        return toolbarTitle
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mPresenter = new ProductDetailPresenterImpl(this);
        setHasOptionsMenu(true)

        if (arguments != null && arguments!!.containsKey("title")) {
            toolbarTitle = arguments!!.getString("title")
        }
    }

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        setLayout(R.layout.fragment_home_kotlin)

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    fun setEmptyView(text: String) {
        hideProgress()
    }
}
