SECTION = "devel/chicken"
DESCRIPTION = "Common-Lisp style formatted output"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://format.meta;md5=989be29ce85d1755f5d0fa050becfecc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/format/format-${PV}.tar.gz"

SRC_URI[md5sum] = "2460acfa858833e8c16b514348257b3f"
SRC_URI[sha256sum] = "2d473b1cad208beeb0da736ab2918d809ab991fddb4b7cba4ce95dd75ddb52f8"

S = "${WORKDIR}/format-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
