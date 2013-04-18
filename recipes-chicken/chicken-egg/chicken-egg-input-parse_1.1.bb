SECTION = "devel/chicken"
DESCRIPTION = "input-stream tokenizing and parsing routines."
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://input-parse.meta;md5=e871452df1e896463399558e19f47ca7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "03dd0cc6a766c79fb25685860d694045"
SRC_URI[sha256sum] = "b161e232d10cc189af16ebae7cba59ecc2c262fdc89bd15223e7482a23e175db"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
