SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=64b2b850a5157a85bf7c0d13d28a1f6c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7ed7c2f92a6a4b8c9eddcf39ef84e295"
SRC_URI[sha256sum] = "24c97df3c9d5a9f69c7cc817b551957af1e7e1832181adf42976aff7a45607fa"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
