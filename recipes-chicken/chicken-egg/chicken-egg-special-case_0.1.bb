SECTION = "devel/chicken"
DESCRIPTION = "Optimizing Special Cases Abstractly"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://special-case.meta;md5=c7112eff70872e7d9eb958ca37712820"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/special-case/special-case-${PV}.tar.gz"

SRC_URI[md5sum] = "8da1d66172494f84a6f265b40c4b065f"
SRC_URI[sha256sum] = "1736093aba0dd01de093bf93e0b2f55112d6c89b9b13eacceb07807801b7bbb8"

S = "${WORKDIR}/special-case-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
