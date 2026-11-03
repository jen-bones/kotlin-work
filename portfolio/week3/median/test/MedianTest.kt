// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of odd number of values {1.0, 2.0, 3.0, 4.0, 5.0} is correct"{
        median(listOf<Float>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "Median of even number of values {1.0, 2.0, 3.0, 4.0} is correct"{
        median(listOf<Float>(1.0f, 2.0f, 3.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }

    "Median of unsorted of values {5.0, 2.0, 4.0, 3.0, 1.0} is correct"{
        median(listOf<Float>(5.0f, 2.0f, 4.0f, 3.0f, 1.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "Median including negative  values {-2.0, 0.0, 1.0, 3.0, 5.0} is correct"{
        median(listOf<Float>(-2.0f, 0.0f, 1.0f, 3.0f, 5.0f)) shouldBe (1.0f plusOrMinus tolerance)
    }

})
