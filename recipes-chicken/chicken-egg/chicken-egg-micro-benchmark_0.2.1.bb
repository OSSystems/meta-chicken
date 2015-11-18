SECTION = "devel/chicken"
DESCRIPTION = "easily create micro-benchmarks"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://micro-benchmark.meta;md5=8cc59421393cee9ad1b6a5b9cddc9e12"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/micro-benchmark/micro-benchmark-${PV}.tar.gz"

SRC_URI[md5sum] = "bfaf3155bb87d5d05c5cbaf1ef3b36d9"
SRC_URI[sha256sum] = "f2de47b19b51ecd14da4cc66e5c0eae7442cb5e6ab45ddc85c32e7a5d45fa8b7"

S = "${WORKDIR}/micro-benchmark-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
