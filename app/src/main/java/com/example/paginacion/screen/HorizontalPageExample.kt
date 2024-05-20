import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PaginacionScreen() {
    val pagerState = rememberPagerState(initialPage = 8) {
        4
    }
    Box(modifier = Modifier) {
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                0 -> Cajamain(page)
                1 -> Cajamain1(page)
                2 -> Cajamain2(page)
                3 -> Cajamain3(page)


            }
        }
    }
}
@Composable
fun Cajamain(contect:Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "componente  $contect",)
    }
}

@Composable
fun Cajamain1(contect:Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "componente  $contect",)
    }
}


@Composable
fun Cajamain2(contect:Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "componente  $contect",)
    }
}


@Composable
fun Cajamain3(contect:Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "componente  $contect",)
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun previewhor(){
    PaginacionScreen()
}