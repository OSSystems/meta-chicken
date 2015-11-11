SECTION = "devel/chicken"
DESCRIPTION = "Load modules lazily"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://autoload.meta;md5=921a3e0f3eca2efb9d867f51b2b92a26"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/autoload/autoload-${PV}.tar.gz"

SRC_URI[md5sum] = "affb943cc676d9f89fadcc5d1a25632c"
SRC_URI[sha256sum] = "12e71e6382b188e5e441f12916a3f4ef8c5e696b2f92ce6952926b1aa7d7648f"

S = "${WORKDIR}/autoload-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
