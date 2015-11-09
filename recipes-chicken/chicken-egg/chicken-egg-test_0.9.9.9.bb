SECTION = "devel/chicken"
DESCRIPTION = "Yet Another Testing Utility"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://test.meta;md5=0633dae6ac8e7d1982c81f08b0abcd51"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "b307d5ad4e1543194fde404646c9ef4d"
SRC_URI[sha256sum] = "744c8cb308021c4d204c010a3a3103c357e62c6425dc9160d73fc73070daab19"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
