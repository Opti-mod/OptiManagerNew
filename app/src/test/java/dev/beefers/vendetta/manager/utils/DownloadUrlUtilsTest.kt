package dev.beefers.vendetta.manager.utils

import kotlin.test.Test
import kotlin.test.assertEquals

class DownloadUrlUtilsTest {
    @Test
    fun convertsGithubBlobUrlToRawDownloadUrl() {
        val input = "https://github.com/Opti-mod/OptiUpdated/blob/main/dist/bunny.js"

        assertEquals(
            "https://raw.githubusercontent.com/Opti-mod/OptiUpdated/main/dist/bunny.js",
            DownloadUrlUtils.normalize(input)
        )
    }
}
