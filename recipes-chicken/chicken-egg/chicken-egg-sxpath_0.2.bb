SECTION = "devel/chicken"
DESCRIPTION = "The sxpath bits of sxml-tools from the SSAX project at Sourceforge"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sxpath.meta;md5=99d5fc848a684c9e468accafb012efa8"
DEPENDS = " chicken-egg-sxpath-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "c8f6edcb631667cb32399a69d8924109"
SRC_URI[sha256sum] = "09b0e077b63b323f1da5eb73ce96424e164d915b172d789b37252e7c988bcf7d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
