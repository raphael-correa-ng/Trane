package org.example.com.rcs.trane.network

import com.rcs.trane.network.PathSegment

data class Path(val segments: List<PathSegment>, val totalDistance: Int)
