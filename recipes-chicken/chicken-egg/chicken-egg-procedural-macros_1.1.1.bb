SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedural-macros.meta;md5=30e64d93f978bc22201937ffc8516d14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedural-macros/procedural-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "aabfd6f59a217d30a3ae37c5741e4de6"
SRC_URI[sha256sum] = "18f5e27df22b9c35afeff916b328fc0334db1298edc844122d9a91ecea6c4087"

S = "${WORKDIR}/procedural-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
