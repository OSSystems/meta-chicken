SECTION = "devel/chicken"
DESCRIPTION = "Typesetting Scheme code from (La)TeX"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://slatex.meta;md5=5601d7f97094b0ec988bae10f7c9dd95"
DEPENDS = " chicken-egg-slatex-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/slatex/slatex-${PV}.tar.gz"

SRC_URI[md5sum] = "896f0e9d7e8c4c904d298962e8119c56"
SRC_URI[sha256sum] = "e6cdddd99986070732c44e26545680f19b9ff22eb6d49312a9eec474d08c6ff3"

S = "${WORKDIR}/slatex-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
