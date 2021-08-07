(ns clojure-lsp.common-symbols)

(def java-lang-syms
  '#{Appendable,
     AutoCloseable,
     CharSequence,
     Cloneable,
     Comparable,
     Iterable,
     Readable,
     Runnable,
     Thread.UncaughtExceptionHandler,
     Boolean,
     Byte,
     Character,
     Character.Subset,
     Character.UnicodeBlock,
     Class,
     ClassLoader,
     ClassValue,
     Compiler,
     Double,
     Enum,
     Float,
     InheritableThreadLocal,
     Integer,
     Long,
     Math,
     Number,
     Object,
     Package,
     Process,
     ProcessBuilder,
     ProcessBuilder.Redirect,
     Runtime,
     RuntimePermission,
     SecurityManager,
     Short,
     StackTraceElement,
     StrictMath,
     String,
     StringBuffer,
     StringBuilder,
     System,
     Thread,
     ThreadGroup,
     ThreadLocal,
     Throwable,
     Void,
     Character.UnicodeScript,
     ProcessBuilder.Redirect.Type,
     Thread.State,
     ArithmeticException,
     ArrayIndexOutOfBoundsException,
     ArrayStoreException,
     ClassCastException,
     ClassNotFoundException,
     CloneNotSupportedException,
     EnumConstantNotPresentException,
     Exception,
     IllegalAccessException,
     IllegalArgumentException,
     IllegalMonitorStateException,
     IllegalStateException,
     IllegalThreadStateException,
     IndexOutOfBoundsException,
     InstantiationException,
     InterruptedException,
     NegativeArraySizeException,
     NoSuchFieldException,
     NoSuchMethodException,
     NullPointerException,
     NumberFormatException,
     ReflectiveOperationException,
     RuntimeException,
     SecurityException,
     StringIndexOutOfBoundsException,
     TypeNotPresentException,
     UnsupportedOperationException,
     AbstractMethodError,
     AssertionError,
     BootstrapMethodError,
     ClassCircularityError,
     ClassFormatError,
     Error,
     ExceptionInInitializerError,
     IllegalAccessError,
     IncompatibleClassChangeError,
     InstantiationError,
     InternalError,
     LinkageError,
     NoClassDefFoundError,
     NoSuchFieldError,
     NoSuchMethodError,
     OutOfMemoryError,
     StackOverflowError,
     ThreadDeath,
     UnknownError,
     UnsatisfiedLinkError,
     UnsupportedClassVersionError,
     VerifyError,
     VirtualMachineError,
     Deprecated,
     Override,
     SafeVarargs,
     SuppressWarnings})

(def java-util-syms
  '#{Collection,
     Comparator,
     Deque,
     Enumeration,
     EventListener,
     Formattable,
     Iterator,
     List,
     ListIterator,
     Map,
     Map.Entry,
     NavigableMap,
     NavigableSet,
     Observer,
     PrimitiveIterator,
     PrimitiveIterator.OfDouble,
     PrimitiveIterator.OfInt,
     PrimitiveIterator.OfLong,
     Queue,
     RandomAccess,
     Set,
     SortedMap,
     SortedSet,
     Spliterator,
     Spliterator.OfDouble,
     Spliterator.OfInt,
     Spliterator.OfLong,
     Spliterator.OfPrimitive,
     AbstractCollection,
     AbstractList,
     AbstractMap,
     AbstractMap.SimpleEntry,
     AbstractMap.SimpleImmutableEntry,
     AbstractQueue,
     AbstractSequentialList,
     AbstractSet,
     ArrayDeque,
     ArrayList,
     Arrays,
     Base64,
     Base64.Decoder,
     Base64.Encoder,
     BitSet,
     Calendar,
     Calendar.Builder,
     Collections,
     Currency,
     Date,
     Dictionary,
     DoubleSummaryStatistics,
     EnumMap,
     EnumSet,
     EventListenerProxy,
     EventObject,
     FormattableFlags,
     Formatter,
     GregorianCalendar,
     HashMap,
     HashSet,
     Hashtable,
     IdentityHashMap,
     IntSummaryStatistics,
     LinkedHashMap,
     LinkedHashSet,
     LinkedList,
     ListResourceBundle,
     Locale,
     Locale.Builder,
     Locale.LanguageRange,
     LongSummaryStatistics,
     Objects,
     Observable,
     Optional,
     OptionalDouble,
     OptionalInt,
     OptionalLong,
     PriorityQueue,
     Properties,
     PropertyPermission,
     PropertyResourceBundle,
     Random,
     ResourceBundle,
     ResourceBundle.Control,
     Scanner,
     ServiceLoader,
     SimpleTimeZone,
     Spliterators,
     Spliterators.AbstractDoubleSpliterator,
     Spliterators.AbstractIntSpliterator,
     Spliterators.AbstractLongSpliterator,
     Spliterators.AbstractSpliterator,
     SplittableRandom,
     Stack,
     StringJoiner,
     StringTokenizer,
     Timer,
     TimerTask,
     TimeZone,
     TreeMap,
     TreeSet,
     UUID,
     Vector,
     WeakHashMap,
     Formatter.BigDecimalLayoutForm,
     Locale.Category,
     Locale.FilteringMode,
     ConcurrentModificationException,
     DuplicateFormatFlagsException,
     EmptyStackException,
     FormatFlagsConversionMismatchException,
     FormatterClosedException,
     IllegalFormatCodePointException,
     IllegalFormatConversionException,
     IllegalFormatException,
     IllegalFormatFlagsException,
     IllegalFormatPrecisionException,
     IllegalFormatWidthException,
     IllformedLocaleException,
     InputMismatchException,
     InvalidPropertiesFormatException,
     MissingFormatArgumentException,
     MissingFormatWidthException,
     MissingResourceException,
     NoSuchElementException,
     TooManyListenersException,
     UnknownFormatConversionException,
     UnknownFormatFlagsException,
     ServiceConfigurationError})

(def core-syms
  '#{*
     *'
     *1
     *2
     *3
     *agent*
     *allow-unresolved-vars*
     *assert*
     *clojure-version*
     *command-line-args*
     *compile-files*
     *compile-path*
     *compiler-options*
     *data-readers*
     *default-data-reader-fn*
     *e
     *err*
     *file*
     *flush-on-newline*
     *fn-loader*
     *in*
     *math-context*
     *ns*
     *out*
     *print-dup*
     *print-length*
     *print-level*
     *print-meta*
     *print-namespace-maps*
     *print-readably*
     *read-eval*
     *reader-resolver*
     *source-path*
     *suppress-read*
     *unchecked-math*
     *use-context-classloader*
     *verbose-defrecords*
     *warn-on-reflection*
     +
     +'
     -
     -'
     ->
     ->>
     ->ArrayChunk
     ->Eduction
     ->Vec
     ->VecNode
     ->VecSeq
     -cache-protocol-fn
     -reset-methods
     .
     ..
     /
     <
     <=
     =
     ==
     >
     >=
     accessor
     aclone
     add-classpath
     add-watch
     agent
     agent-error
     agent-errors
     aget
     alength
     alias
     all-ns
     alter
     alter-meta!
     alter-var-root
     amap
     ancestors
     and
     any?
     apply
     areduce
     array-map
     as->
     aset
     aset-boolean
     aset-byte
     aset-char
     aset-double
     aset-float
     aset-int
     aset-long
     aset-short
     assert
     assoc
     assoc!
     assoc-in
     associative?
     atom
     await
     await-for
     await1
     bases
     bean
     bigdec
     bigint
     biginteger
     binding
     bit-and
     bit-and-not
     bit-clear
     bit-flip
     bit-not
     bit-or
     bit-set
     bit-shift-left
     bit-shift-right
     bit-test
     bit-xor
     boolean
     boolean-array
     boolean?
     booleans
     bound-fn
     bound-fn*
     bound?
     bounded-count
     butlast
     byte
     byte-array
     bytes
     bytes?
     case
     cast
     cat
     catch
     char
     char-array
     char-escape-string
     char-name-string
     char?
     chars
     chunk
     chunk-append
     chunk-buffer
     chunk-cons
     chunk-first
     chunk-next
     chunk-rest
     chunked-seq?
     class
     class?
     clear-agent-errors
     clojure-version
     coll?
     comment
     commute
     comp
     comparator
     compare
     compare-and-set!
     compile
     complement
     completing
     concat
     cond
     cond->
     cond->>
     condp
     conj
     conj!
     cons
     constantly
     construct-proxy
     contains?
     count
     counted?
     create-ns
     create-struct
     cycle
     dec
     dec'
     decimal?
     declare
     dedupe
     def
     default-data-readers
     definline
     definterface
     defmacro
     defmethod
     defmulti
     defn
     defn-
     defonce
     defprotocol
     defrecord
     defstruct
     deftype
     delay
     delay?
     deliver
     denominator
     deref
     derive
     descendants
     destructure
     disj
     disj!
     dissoc
     dissoc!
     distinct
     distinct?
     do
     doall
     dorun
     doseq
     dosync
     dotimes
     doto
     double
     double-array
     double?
     doubles
     drop
     drop-last
     drop-while
     eduction
     empty
     EMPTY-NODE
     empty?
     ensure
     ensure-reduced
     enumeration-seq
     error-handler
     error-mode
     eval
     even?
     every-pred
     every?
     ex-data
     ex-info
     extend
     extend-protocol
     extend-type
     extenders
     extends?
     false?
     ffirst
     file-seq
     filter
     filterv
     finally
     find
     find-keyword
     find-ns
     find-protocol-impl
     find-protocol-method
     find-var
     first
     flatten
     float
     float-array
     float?
     floats
     flush
     fn
     fn?
     fnext
     fnil
     for
     force
     format
     frequencies
     future
     future-call
     future-cancel
     future-cancelled?
     future-done?
     future?
     gen-class
     gen-interface
     gensym
     get
     get-in
     get-method
     get-proxy-class
     get-thread-bindings
     get-validator
     group-by
     halt-when
     hash
     hash-combine
     hash-map
     hash-ordered-coll
     hash-set
     hash-unordered-coll
     ident?
     identical?
     identity
     if
     if-let
     if-not
     if-some
     ifn?
     import
     in-ns
     inc
     inc'
     indexed?
     init-proxy
     Inst
     inst-ms
     inst-ms*
     inst?
     instance?
     int
     int-array
     int?
     integer?
     interleave
     intern
     interpose
     into
     into-array
     ints
     io!
     isa?
     iterate
     iterator-seq
     juxt
     keep
     keep-indexed
     key
     keys
     keyword
     keyword?
     last
     lazy-cat
     lazy-seq
     let
     letfn
     line-seq
     list
     list*
     list?
     load
     load-file
     load-reader
     load-string
     loaded-libs
     locking
     long
     long-array
     longs
     loop
     macroexpand
     macroexpand-1
     make-array
     make-hierarchy
     map
     map-entry?
     map-indexed
     map?
     mapcat
     mapv
     max
     max-key
     memfn
     memoize
     merge
     merge-with
     meta
     method-sig
     methods
     min
     min-key
     mix-collection-hash
     mod
     monitor-enter
     monitor-exit
     munge
     name
     namespace
     namespace-munge
     nat-int?
     neg-int?
     neg?
     new
     newline
     next
     nfirst
     nil?
     nnext
     not
     not-any?
     not-empty
     not-every?
     not=
     ns
     ns-aliases
     ns-imports
     ns-interns
     ns-map
     ns-name
     ns-publics
     ns-refers
     ns-resolve
     ns-unalias
     ns-unmap
     nth
     nthnext
     nthrest
     num
     number?
     numerator
     object-array
     odd?
     or
     parents
     partial
     partition
     partition-all
     partition-by
     pcalls
     peek
     persistent!
     pmap
     pop
     pop!
     pop-thread-bindings
     pos-int?
     pos?
     pr
     pr-str
     prefer-method
     prefers
     primitives-classnames
     print
     print-ctor
     print-dup
     print-method
     print-simple
     print-str
     printf
     println
     println-str
     prn
     prn-str
     promise
     proxy
     proxy-call-with-super
     proxy-mappings
     proxy-name
     proxy-super
     push-thread-bindings
     pvalues
     qualified-ident?
     qualified-keyword?
     qualified-symbol?
     quot
     quote
     rand
     rand-int
     rand-nth
     random-sample
     range
     ratio?
     rational?
     rationalize
     re-find
     re-groups
     re-matcher
     re-matches
     re-pattern
     re-seq
     read
     read-line
     read-string
     reader-conditional
     reader-conditional?
     realized?
     record?
     recur
     reduce
     reduce-kv
     reduced
     reduced?
     reductions
     ref
     ref-history-count
     ref-max-history
     ref-min-history
     ref-set
     refer
     refer-clojure
     reify
     release-pending-sends
     rem
     remove
     remove-all-methods
     remove-method
     remove-ns
     remove-watch
     repeat
     repeatedly
     replace
     replicate
     require
     reset!
     reset-meta!
     reset-vals!
     resolve
     rest
     restart-agent
     resultset-seq
     reverse
     reversible?
     rseq
     rsubseq
     run!
     satisfies?
     second
     select-keys
     send
     send-off
     send-via
     seq
     seq?
     seqable?
     seque
     sequence
     sequential?
     set
     set!
     set-agent-send-executor!
     set-agent-send-off-executor!
     set-error-handler!
     set-error-mode!
     set-validator!
     set?
     short
     short-array
     shorts
     shuffle
     shutdown-agents
     simple-ident?
     simple-keyword?
     simple-symbol?
     slurp
     some
     some->
     some->>
     some-fn
     some?
     sort
     sort-by
     sorted-map
     sorted-map-by
     sorted-set
     sorted-set-by
     sorted?
     special-symbol?
     spit
     split-at
     split-with
     StackTraceElement->vec
     str
     string?
     struct
     struct-map
     subs
     subseq
     subvec
     supers
     swap!
     swap-vals!
     symbol
     symbol?
     sync
     tagged-literal
     tagged-literal?
     take
     take-last
     take-nth
     take-while
     test
     the-ns
     thread-bound?
     throw
     Throwable->map
     time
     to-array
     to-array-2d
     trampoline
     transduce
     transient
     tree-seq
     true?
     try
     type
     unchecked-add
     unchecked-add-int
     unchecked-byte
     unchecked-char
     unchecked-dec
     unchecked-dec-int
     unchecked-divide-int
     unchecked-double
     unchecked-float
     unchecked-inc
     unchecked-inc-int
     unchecked-int
     unchecked-long
     unchecked-multiply
     unchecked-multiply-int
     unchecked-negate
     unchecked-negate-int
     unchecked-remainder-int
     unchecked-short
     unchecked-subtract
     unchecked-subtract-int
     underive
     unquote
     unquote-splicing
     unreduced
     unsigned-bit-shift-right
     update
     update-in
     update-proxy
     uri?
     use
     uuid?
     val
     vals
     var
     var-get
     var-set
     var?
     vary-meta
     vec
     vector
     vector-of
     vector?
     volatile!
     volatile?
     vreset!
     vswap!
     when
     when-first
     when-let
     when-not
     when-some
     while
     with-bindings
     with-bindings*
     with-in-str
     with-loading-context
     with-local-vars
     with-meta
     with-open
     with-out-str
     with-precision
     with-redefs
     with-redefs-fn
     xml-seq
     zero?
     zipmap})

(def cljs-syms
  '#{*clojurescript-version*
     *eval*
     *exec-tap-fn*
     *loaded-libs*
     *main-cli-fn*
     *print-err-fn*
     *print-fn*
     *print-fn-bodies*
     *print-newline*
     *target*
     *unchecked-arrays*
     *unchecked-if*
     *warn-on-infer*
     ->ArrayIter
     ->ArrayList
     ->ArrayNode
     ->ArrayNodeIterator
     ->ArrayNodeSeq
     ->Atom
     ->BitmapIndexedNode
     ->BlackNode
     ->Box
     ->ChunkBuffer
     ->ChunkedCons
     ->ChunkedSeq
     ->Cons
     ->Cycle
     ->Delay
     ->ES6EntriesIterator
     ->ES6Iterator
     ->ES6IteratorSeq
     ->ES6SetEntriesIterator
     ->Empty
     ->EmptyList
     ->HashCollisionNode
     ->HashMapIter
     ->HashSetIter
     ->IndexedSeq
     ->IndexedSeqIterator
     ->Iterate
     ->KeySeq
     ->Keyword
     ->LazySeq
     ->List
     ->Many
     ->MapEntry
     ->MetaFn
     ->MultiFn
     ->MultiIterator
     ->Namespace
     ->NeverEquiv
     ->NodeIterator
     ->NodeSeq
     ->ObjMap
     ->PersistentArrayMap
     ->PersistentArrayMapIterator
     ->PersistentArrayMapSeq
     ->PersistentHashMap
     ->PersistentHashSet
     ->PersistentQueue
     ->PersistentQueueIter
     ->PersistentQueueSeq
     ->PersistentTreeMap
     ->PersistentTreeMapSeq
     ->PersistentTreeSet
     ->PersistentVector
     ->RSeq
     ->Range
     ->RangeChunk
     ->RangeIterator
     ->RangedIterator
     ->RecordIter
     ->RedNode
     ->Reduced
     ->Repeat
     ->SeqIter
     ->Single
     ->StringBufferWriter
     ->StringIter
     ->Subvec
     ->Symbol
     ->TaggedLiteral
     ->TransformerIterator
     ->TransientArrayMap
     ->TransientHashMap
     ->TransientHashSet
     ->TransientVector
     ->UUID
     ->ValSeq
     ->Var
     ->VectorNode
     ->Volatile
     ->t_cljs$core11184
     ->t_cljs$core9576
     -add-method
     -add-watch
     -as-transient
     -assoc
     -assoc!
     -assoc-n
     -assoc-n!
     -chunked-first
     -chunked-next
     -chunked-rest
     -clj->js
     -clone
     -comparator
     -compare
     -conj
     -conj!
     -contains-key?
     -count
     -default-dispatch-val
     -deref
     -deref-with-timeout
     -disjoin
     -disjoin!
     -dispatch-fn
     -dissoc
     -dissoc!
     -drop-first
     -empty
     -entry-key
     -equiv
     -find
     -first
     -flush
     -get-method
     -hash
     -invoke
     -iterator
     -js->clj
     -key
     -key->js
     -kv-reduce
     -lookup
     -meta
     -methods
     -name
     -namespace
     -next
     -notify-watches
     -nth
     -peek
     -persistent!
     -pop
     -pop!
     -pr-writer
     -prefer-method
     -prefers
     -realized?
     -reduce
     -remove-method
     -remove-watch
     -reset
     -reset!
     -rest
     -rseq
     -seq
     -sorted-seq
     -sorted-seq-from
     -swap!
     -val
     -vreset!
     -with-meta
     -write
     APersistentVector
     ASeq
     ArrayChunk
     ArrayIter
     ArrayList
     ArrayNode
     ArrayNodeIterator
     ArrayNodeSeq
     Atom
     BitmapIndexedNode
     BlackNode
     Box
     CHAR_MAP
     ChunkBuffer
     ChunkedCons
     ChunkedSeq
     Cons
     Cycle
     DEMUNGE_MAP
     DEMUNGE_PATTERN
     Delay
     ES6EntriesIterator
     ES6Iterator
     ES6IteratorSeq
     ES6SetEntriesIterator
     Eduction
     Empty
     EmptyList
     ExceptionInfo
     Fn
     HashCollisionNode
     HashMapIter
     HashSetIter
     IAssociative
     IAtom
     IChunk
     IChunkedNext
     IChunkedSeq
     ICloneable
     ICollection
     IComparable
     ICounted
     IDeref
     IDerefWithTimeout
     IEditableCollection
     IEmptyableCollection
     IEncodeClojure
     IEncodeJS
     IEquiv
     IFind
     IFn
     IHash
     IIndexed
     IIterable
     IKVReduce
     IList
     ILookup
     IMap
     IMapEntry
     IMeta
     IMultiFn
     INIT
     INamed
     INext
     IPending
     IPrintWithWriter
     IRecord
     IReduce
     IReset
     IReversible
     ISeq
     ISeqable
     ISequential
     ISet
     ISorted
     IStack
     ISwap
     ITER_SYMBOL
     ITransientAssociative
     ITransientCollection
     ITransientMap
     ITransientSet
     ITransientVector
     IUUID
     IVector
     IVolatile
     IWatchable
     IWithMeta
     IWriter
     IndexedSeq
     IndexedSeqIterator
     Iterate
     KeySeq
     Keyword
     LazySeq
     List
     MODULE_INFOS
     MODULE_URIS
     Many
     MapEntry
     MetaFn
     MultiFn
     MultiIterator
     NS_CACHE
     Namespace
     NeverEquiv
     NodeIterator
     NodeSeq
     ObjMap
     PROTOCOL_SENTINEL
     PersistentArrayMap
     PersistentArrayMapIterator
     PersistentArrayMapSeq
     PersistentHashMap
     PersistentHashSet
     PersistentQueue
     PersistentQueueIter
     PersistentQueueSeq
     PersistentTreeMap
     PersistentTreeMapSeq
     PersistentTreeSet
     PersistentVector
     RSeq
     Range
     RangeChunk
     RangeIterator
     RangedIterator
     RecordIter
     RedNode
     Reduced
     Repeat
     START
     SeqIter
     Single
     StringBufferWriter
     StringIter
     Subvec
     Symbol
     TaggedLiteral
     TransformerIterator
     TransientArrayMap
     TransientHashMap
     TransientHashSet
     TransientVector
     UUID
     ValSeq
     Var
     VectorNode
     Volatile
     add-tap
     add-to-string-hash-cache
     apply-to
     array
     array-chunk
     array-index-of
     array-iter
     array-list
     array-seq
     array?
     bit-count
     bit-shift-right-zero-fill
     chunked-seq
     clj->js
     clone
     cloneable?
     default-dispatch-val
     demunge
     dispatch-fn
     divide
     enable-console-print!
     equiv-map
     es6-entries-iterator
     es6-iterator
     es6-iterator-seq
     es6-set-entries-iterator
     ex-cause
     ex-message
     exists?
     find-macros-ns
     find-ns-obj
     gensym_counter
     hash-keyword
     hash-string
     hash-string*
     ifind?
     imul
     infinite?
     int-rotate-left
     is_proto_
     iter
     iterable?
     js->clj
     js-delete
     js-invoke
     js-keys
     js-mod
     js-obj
     js-reserved
     key->js
     key-test
     keyword-identical?
     m3-C1
     m3-C2
     m3-fmix
     m3-hash-int
     m3-hash-unencoded-chars
     m3-mix-H1
     m3-mix-K1
     m3-seed
     missing-protocol
     mk-bound-fn
     native-satisfies?
     nil-iter
     not-native
     ns-interns*
     obj-map
     object?
     persistent-array-map-seq
     pr-seq-writer
     pr-sequential-writer
     pr-str*
     pr-str-with-opts
     prim-seq
     print-map
     print-meta?
     print-prefix-map
     prn-str-with-opts
     random-uuid
     ranged-iterator
     reduceable?
     regexp?
     remove-tap
     seq-iter
     set-from-indexed-seq
     set-print-err-fn!
     set-print-fn!
     spread
     string-hash-cache
     string-hash-cache-count
     string-iter
     string-print
     symbol-identical?
     system-time
     t_cljs$core11184
     t_cljs$core9576
     tap>
     this-as
     transformer-iterator
     truth_
     type->str
     undefined?
     uuid
     write-all})

(def java-util-imports
  (->> java-util-syms
       (mapv (juxt identity #(symbol (str "java.util." (name %)))))
       (into {})))

(def common-refers->info
  {'deftest      'clojure.test
   'testing      'clojure.test
   'is           'clojure.test
   'are          'clojure.test
   'use-fixture  'clojure.test
   'run-tests    'clojure.test
   'doc          'clojure.repl
   '<!           'clojure.core.async
   '<!!          'clojure.core.async
   '>!           'clojure.core.async
   '>!!          'clojure.core.async
   'alt!         'clojure.core.async
   'alt!!        'clojure.core.async
   'alts!        'clojure.core.async
   'chan         'clojure.core.async
   'put!         'clojure.core.async
   'take!        'clojure.core.async
   'alts!!       'clojure.core.async
   'go           'clojure.core.async
   'go-loop      'clojure.core.async
   'ANY          'compojure.core
   'DELETE       'compojure.core
   'GET          'compojure.core
   'PATCH        'compojure.core
   'POST         'compojure.core
   'PUT          'compojure.core
   'context      'compojure.core
   'defroutes    'compojure.core
   'defentity    'korma.core
   'reg-event-db 're-frame.core
   'reg-sub      're-frame.core
   'reg-event-fx 're-frame.core
   'fact         'midje.sweet
   'facts        'midje.sweet})

(def common-alias->info
  {'async  'clojure.core.async
   'csv    'clojure.data.csv
   'xml    'clojure.data.xml
   'edn    'clojure.edn
   'io     'clojure.java.io
   'sh     'clojure.java.shell
   'pprint 'clojure.pprint
   'repl   'clojure.repl
   'set    'clojure.set
   'spec   'clojure.spec.alpha
   'str    'clojure.string
   'walk   'clojure.walk
   'zip    'clojure.zip})
