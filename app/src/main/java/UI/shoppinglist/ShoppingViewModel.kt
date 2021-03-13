package UI.shoppinglist

import androidx.lifecycle.ViewModel
import entities.ShoppingItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import repositories.ShoppingRepository

class ShoppingViewModel (
    private val repository: ShoppingRepository
): ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope (Dispatchers.Main).launch {
    repository.upsert((item))
    }

    fun delete(item: ShoppingItem) = CoroutineScope (Dispatchers.Main).launch {
        repository.delete((item))
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}