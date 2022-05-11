package com.example.mybankline_android.ui.statement

import androidx.lifecycle.ViewModel
import com.example.mybankline_android.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}