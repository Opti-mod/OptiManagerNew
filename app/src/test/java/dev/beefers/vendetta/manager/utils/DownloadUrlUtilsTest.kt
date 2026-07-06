package dev.beefers.vendetta.manager.utils

import kotlin.test.Test
import kotlin.test.assertEquals

class DownloadUrlUtilsTest {
    @Test
    fun convertsGithubBlobUrlToRawDownloadUrl() {
        val input = "https://github.com/Opti-mod/Opti/blob/main/dist/bunny.js"

        assertEquals(
            "https://raw.githubusercontent.com/Opti-mod/Opti/main/dist/bunny.js",
            DownloadUrlUtils.normalize(input)
        )
    }
}
