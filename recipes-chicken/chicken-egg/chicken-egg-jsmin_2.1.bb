SECTION = "devel/chicken"
DESCRIPTION = "Implementation of Douglas Crockford's JavaScript minifier in CHICKEN Scheme"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://jsmin.meta;md5=5e58a9cc43837f51a29634479cd0b793"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "139e8c323b0f537b73a8a7307b8e7a87"
SRC_URI[sha256sum] = "631d3894b1701a6ba4e264f686431c47ba30a53ffffffe8fa6418982f15a04f5"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
