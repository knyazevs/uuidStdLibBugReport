import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

class UuidTest {
    @OptIn(ExperimentalUuidApi::class)
    @Test
    fun testUuid() {
        assertEquals(36, Uuid.random().toString().length)
    }
}