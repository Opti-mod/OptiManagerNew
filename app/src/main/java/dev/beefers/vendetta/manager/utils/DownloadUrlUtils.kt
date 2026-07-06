package dev.beefers.vendetta.manager.utils

object DownloadUrlUtils {
    private val githubBlobUrl = Regex(
        "^https://github\\.com/([^/]+)/([^/]+)/blob/([^/]+)/(.+)$"
    )

    fun normalize(url: String): String {
        val trimmed = url.trim()
        val match = githubBlobUrl.matchEntire(trimmed) ?: return trimmed
        val (owner, repo, ref, path) = match.destructured
        return "https://raw.githubusercontent.com/$owner/$repo/$ref/$path"
    }
}
