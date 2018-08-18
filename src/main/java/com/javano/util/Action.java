package com.javano.util;

public interface Action {
	
	public final static String ACCOUNT_BALANCE = "account_balance";
	public final static String ACCOUNT_BLOCK_COUNT = "account_block_count";
	public final static String ACCOUNT_CREATE = "account_create";
	public final static String ACCOUNT_GET = "account_get";
	public final static String ACCOUNT_HISTORY = "account_history";
	public final static String ACCOUNT_INFO = "account_info";
	public final static String ACCOUNT_LIST = "account_list";
	public final static String ACCOUNT_MOVE = "account_move";
	public final static String ACCOUNT_PUBLIC_KEY = "account_key";
	public final static String ACCOUNT_REMOVE = "account_remove";
	public final static String ACCOUNT_REPRESENTATIVE_SET = "account_representative_set";
	public final static String ACCOUNT_REPRESENTATIVE = "account_representative";
	public final static String ACCOUNT_WEIGHT = "account_weight";
	public final static String ACCOUNTS_BALANCES = "accounts_balances";
	public final static String ACCOUNTS_CREATE = "accounts_create";
	public final static String ACCOUNTS_FRONTIER = "accounts_frontier";
	public final static String ACCOUNTS_PENDING = "accounts_pending";
	public final static String VALIDATE_ACOUNT_NUMBER = "validate_account_number";
	
	public final static String BLOCK_ACCOUNT = "block_account";
	public final static String BLOCK_COUNT = "block_count";
	public final static String BLOCK_COUNT_TYPE = "block_count_type";
	public final static String CHAIN = "chain";
	public final static String BLOCK_CREATE = "block_create";
	public final static String PROCESS = "process";
	public final static String BLOCK = "block";
	public final static String BLOCKS_INFO = "blocks_info";
	public final static String BLOCKS = "blocks";
	
	public final static String BOOTSTRAP = "bootstrap";
	public final static String BOOTSTRAP_ANY = "bootstrap_any";
	
	public final static String KRAI_FROM_RAW = "krai_from_raw";
	public final static String KRAI_TO_RAW = "krai_to_raw";
	public final static String MRAI_FROM_RAW = "mrai_from_raw";
	public final static String MRAI_TO_RAW = "mrai_to_raw";
	public final static String RAI_FROM_RAW = "rai_from_raw";
	public final static String RAI_TO_RAW = "krai_to_raw";
	
	public final static String BLOCK_CONFIRM = "block_confirm";
	public final static String CONFIRMATION_HISTORY = "confirmation_history";
	
	public final static String DELEGATORS = "delegators";
	public final static String DELEGATORS_COUNT = "delegators_count";
	
	public final static String FRONTIERS = "frontiers";
	public final static String FRONTIER_COUNT = "frontier_count";
	
	public final static String DETERMINISTIC_KEY = "deterministic_key";
	public final static String KEY_CREATE = "key_create";
	public final static String KEY_EXPAND = "key_expand";
	
	public final static String HISTORY = "history";
	public final static String LEDGER = "ledger";
	public final static String SUCCESSORS = "successors";
	
	public final static String AVAILABLE_SUPPLY = "available_supply";
	public final static String KEEPALIVE = "keepalive";
	public final static String REEPUBLISH = "republish";
	
	public final static String VERSION = "version";
	public final static String STOP = "stop";
	
	public final static String PAYMENT_BEGIN = "payment_begin";
	public final static String PAYMENT_END = "payment_end";
	public final static String PAYMENT_INIT = "payment_init";
	public final static String PAYMENT_WAIT = "payment_wait";
	
	public final static String WORK_PEER_ADD = "work_peer_add";
	public final static String WORK_PEERS_CLEAR = "work_peers_clear";
	public final static String PEERS = "peers";
	public final static String WORK_PEERS = "work_peers";
	
	public final static String PENDING = "pending";
	public final static String PENDING_EXISTS = "pending_exists";
	public final static String SEARCH_PENDING = "search_pending";
	public final static String SEARCH_PENDING_ALL = "search_pending_all";
	
	public final static String WORK_CANCEL = "work_cancel";
	public final static String WORK_GENERATE = "work_generate";
	public final static String WORK_GET = "work_get";
	public final static String WORK_SET = "work_set";
	public final static String WORK_VALIDATE = "work_validate";
	
	public final static String RECEIVE = "receive";
	public final static String RECEIVE_MINIMUM = "receive_minimum";
	public final static String RECEIVE_MINIMUM_SET = "receive_minimum_set";
	
	public final static String REPRESENTATIVES = "representatives";
	public final static String REPRESENTATIVES_ONLINE = "representatives_online";
	public final static String WALLET_REPRESENTATIVE = "wallet_representative";
	public final static String WALLET_REPRESENTATIVE_SET = "wallet_representative_set";
	
	public final static String SEND = "send";
	
	public final static String STATS = "stats";
	
	public final static String UNCHECKED_CLEAR = "unchecked_clear";
	public final static String UNCHECKED_GET = "unchecked_get";
	public final static String UNCHECKED_KEYS = "unchecked_keys";
	public final static String UNCHECKED = "unchecked";
	
	public final static String WALLET_BALANCES = "wallet_balances";
	public final static String WALLET_ADD = "wallet_add";
	public final static String WALLET_ADD_WATCH = "wallet_add_watch";
	public final static String PASSWORD_CHANGE = "password_change";
	public final static String WALLET_CHANGE_SEED = "wallet_change_seed";
	public final static String WALLET_CONTAINS = "wallet_contains";
	public final static String WALLET_CREATE = "wallet_create";
	public final static String WALLET_DESTROY = "wallet_destroy";
	public final static String WALLET_EXPORT = "wallet_export";
	public final static String WALLET_FRONTIERS = "wallet_frontiers";
	public final static String WALLET_LEDGER = "wallet_ledger";
	public final static String WALLET_LOCK = "wallet_lock";
	public final static String WALLET_LOCKED = "wallet_locked";
	public final static String PASSWORD_ENTER = "password_enter";
	public final static String WALLET_PENDING = "wallet_pending";
	public final static String WALLET_REPUBLISH = "wallet_republish";
	public final static String WALLET_BALANCE_TOTAL = "wallet_balance_total";
	public final static String PASSWORD_VALID = "password_valid";
	public final static String WALLET_WORK_GET = "wallet_work_get";
}
