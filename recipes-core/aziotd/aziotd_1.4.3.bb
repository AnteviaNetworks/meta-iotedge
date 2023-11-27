# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo pkgconfig

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get aziotd could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/aziotd/1.4.1"
SRC_URI += "gitsm://github.com/Azure/iot-identity-service;protocol=https;nobranch=1"
SRCREV = "cfa39b58ec0931d62597d1c1f4908fa202c23a32"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "aziotd"
PV_append = ".AUTOINC+cfa39b58ec"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anyhow/1.0.69 \
    crate://crates.io/async-recursion/1.0.2 \
    crate://crates.io/async-trait/0.1.64 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.0 \
    crate://crates.io/bindgen/0.64.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/byte-unit/4.0.18 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.23 \
    crate://crates.io/clang-sys/1.4.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/colored/2.0.0 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crossbeam-channel/0.5.6 \
    crate://crates.io/crossbeam-deque/0.8.2 \
    crate://crates.io/crossbeam-epoch/0.9.13 \
    crate://crates.io/crossbeam-utils/0.8.14 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/cxx-build/1.0.89 \
    crate://crates.io/cxx/1.0.89 \
    crate://crates.io/cxxbridge-flags/1.0.89 \
    crate://crates.io/cxxbridge-macro/1.0.89 \
    crate://crates.io/darling/0.14.3 \
    crate://crates.io/darling_core/0.14.3 \
    crate://crates.io/darling_macro/0.14.3 \
    crate://crates.io/dashmap/5.4.0 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/erased-serde/0.3.24 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/filetime/0.2.20 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/fsevent-sys/2.0.1 \
    crate://crates.io/fsevent/0.4.0 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.26 \
    crate://crates.io/futures-core/0.3.26 \
    crate://crates.io/futures-executor/0.3.26 \
    crate://crates.io/futures-io/0.3.26 \
    crate://crates.io/futures-macro/0.3.26 \
    crate://crates.io/futures-sink/0.3.26 \
    crate://crates.io/futures-task/0.3.26 \
    crate://crates.io/futures-util/0.3.26 \
    crate://crates.io/futures/0.3.26 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/gimli/0.27.1 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/h2/0.3.15 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.8 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-openssl/0.9.2 \
    crate://crates.io/hyper-proxy/0.9.1 \
    crate://crates.io/hyper/0.14.24 \
    crate://crates.io/iana-time-zone-haiku/0.1.1 \
    crate://crates.io/iana-time-zone/0.1.53 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/indexmap/1.9.2 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.7.1 \
    crate://crates.io/io-lifetimes/1.0.5 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/is-terminal/0.4.3 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.5 \
    crate://crates.io/js-sys/0.3.61 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/link-cplusplus/1.0.8 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linked_hash_set/0.1.4 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/mio-extras/2.0.6 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/mio/0.8.5 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/net2/0.2.38 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/nom8/0.2.0 \
    crate://crates.io/notify/4.0.17 \
    crate://crates.io/ntapi/0.4.0 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.3 \
    crate://crates.io/once_cell/1.17.0 \
    crate://crates.io/openssl-errors/0.2.0 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-sys/0.9.80 \
    crate://crates.io/openssl/0.10.45 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/paste/1.0.11 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.51 \
    crate://crates.io/quote/1.0.23 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.10.2 \
    crate://crates.io/rayon/1.6.1 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.36.8 \
    crate://crates.io/ryu/1.0.12 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scratch/1.0.3 \
    crate://crates.io/serde/1.0.152 \
    crate://crates.io/serde_derive/1.0.152 \
    crate://crates.io/serde_json/1.0.93 \
    crate://crates.io/serde_spanned/0.6.1 \
    crate://crates.io/serde_with/2.2.0 \
    crate://crates.io/serde_with_macros/2.2.0 \
    crate://crates.io/serial_test/1.0.0 \
    crate://crates.io/serial_test_derive/1.0.0 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.7 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.3.26 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/sysinfo/0.27.7 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.6 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time/0.3.17 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/1.8.2 \
    crate://crates.io/tokio-openssl/0.6.3 \
    crate://crates.io/tokio-util/0.7.6 \
    crate://crates.io/tokio/1.25.0 \
    crate://crates.io/toml/0.7.2 \
    crate://crates.io/toml_datetime/0.6.1 \
    crate://crates.io/toml_edit/0.19.3 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicode-bidi/0.3.10 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/utf8-width/0.1.6 \
    crate://crates.io/uuid/1.3.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.84 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.84 \
    crate://crates.io/wasm-bindgen-macro/0.2.84 \
    crate://crates.io/wasm-bindgen-shared/0.2.84 \
    crate://crates.io/wasm-bindgen/0.2.84 \
    crate://crates.io/wildmatch/2.1.1 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-targets/0.42.1 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.1 \
    crate://crates.io/windows_aarch64_msvc/0.42.1 \
    crate://crates.io/windows_i686_gnu/0.42.1 \
    crate://crates.io/windows_i686_msvc/0.42.1 \
    crate://crates.io/windows_x86_64_gnu/0.42.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.1 \
    crate://crates.io/windows_x86_64_msvc/0.42.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
"

LIC_FILES_CHKSUM=" \
file://LICENSE;md5=4f9c2c296f77b3096b6c11a16fa7c66e \
"

SUMMARY = "The aziotd is the binary for IoT identity service"
HOMEPAGE = "https://github.com/azure/iot-identity-service"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include aziotd-${PV}.inc
include aziotd.inc
