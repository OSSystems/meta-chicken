SECTION = "devel/chicken"
DESCRIPTION = "Optimized record access"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://record-variants.meta;md5=2e93e83cc333017b6bdb014d353d6301"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "bd0f32e99c7e4f6938b7709eb81984ea"
SRC_URI[sha256sum] = "fe92b40c676d20cb46bccbd5bd38c71a589ffce340c3bd9dcd91a8e123d64ffc"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
